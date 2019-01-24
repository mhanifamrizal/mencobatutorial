package mencobatutorial.portlet;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import mencobatutorial.constants.MencobatutorialPortletKeys;
import testing.model.mencobatutorial;
import testing.model.mencobatutorialEntry;
import testing.service.mencobatutorialEntryLocalService;
import testing.service.mencobatutorialLocalService;


/**
 * @author Hanif
 * @param <mencobatutorialservice>
 */

@Component(
	    immediate = true,
	    property = {
	    	"javax.portlet.name=" + MencobatutorialPortletKeys.Mencobatutorial,
	        "com.liferay.portlet.display-category=category.social",
	        "com.liferay.portlet.instanceable=false",
	        "com.liferay.portlet.scopeable=true",
	        "javax.portlet.display-name=mencobatutorial",
	        "javax.portlet.expiration-cache=0",
	        "javax.portlet.init-param.template-path=/",
	        "javax.portlet.init-param.view-template=/mencobatutorialportlet/view.jsp",
	        "javax.portlet.resource-bundle=content.Language",
	        "javax.portlet.security-role-ref=power-user,user",
	        "javax.portlet.supports.mime-type=text/html"
	    },
	    service = Portlet.class
	)

public class MencobatutorialPortlet<mencobatutorialservice> extends MVCPortlet {
	public void addEntry(ActionRequest request, ActionResponse response)
	            throws PortalException {
	
	        ServiceContext serviceContext = ServiceContextFactory.getInstance(
	            mencobatutorialEntry.class.getName(), request);
	
	        String userName = ParamUtil.getString(request, "name");
	        String email = ParamUtil.getString(request, "email");
	        String message = ParamUtil.getString(request, "message");
	        long guestbookId = ParamUtil.getLong(request, "guestbookId");
	        long entryId = ParamUtil.getLong(request, "entryId");
	
	    if (entryId > 0) {
	
	        try {
	        	_mencobatutorialentryLocalService.updateEntry(
	                serviceContext.getUserId(), guestbookId, entryId, userName,
	                email, message, serviceContext);
	
	            SessionMessages.add(request, "entryAdded");
	
	            response.setRenderParameter(
	                "guestbookId", Long.toString(guestbookId));
	
	        }
	        catch (Exception e) {
	            System.out.println(e);
	
	            SessionErrors.add(request, e.getClass().getName());
	
	            PortalUtil.copyRequestParameters(request, response);
	
	            response.setRenderParameter(
	                "mvcPath", "/mencobatutorialportlet/edit_entry.jsp");
	        }
	
	    }
	    else {
	
	        try {
	        	_mencobatutorialentryLocalService.addEntry(
	                serviceContext.getUserId(), guestbookId, userName, email,
	                message, serviceContext);
	
	            SessionMessages.add(request, "mencobatutorialEntryadded");
	
	            response.setRenderParameter(
	                "guestbookId", Long.toString(guestbookId));
	
	        }
	        catch (Exception e) {
	            SessionErrors.add(request, e.getClass().getName());
	
	            PortalUtil.copyRequestParameters(request, response);
	
	            response.setRenderParameter(
	                "mvcPath", "/mencobatutorialportlet/edit_entry.jsp");
	        }
	    }
	}
	
	public void deleteEntry(ActionRequest request, ActionResponse response) throws PortalException {
        long entryId = ParamUtil.getLong(request, "entryId");
        long guestbookId = ParamUtil.getLong(request, "guestbookId");

        ServiceContext serviceContext = ServiceContextFactory.getInstance(
            mencobatutorial.class.getName(), request);

        try {

            response.setRenderParameter(
                "guestbookId", Long.toString(guestbookId));
            SessionMessages.add(request, "mencobatutorialEntrydeleted");
            _mencobatutorialentryLocalService.deleteEntry(entryId, serviceContext);
        }

        catch (Exception e) {
            Logger.getLogger(MencobatutorialPortlet.class.getName()).log(
                Level.SEVERE, null, e);
            SessionErrors.add(request, e.getClass().getName());
        }
	}
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
	        throws IOException, PortletException {

	        try {
	            ServiceContext serviceContext = ServiceContextFactory.getInstance(
	                mencobatutorial.class.getName(), renderRequest);

	            long groupId = serviceContext.getScopeGroupId();

	            long guestbookId = ParamUtil.getLong(renderRequest, "guestbookId");

	            List<mencobatutorial> guestbooks = _mencobatutorialLocalService.getGuestbooks(
	                groupId);

	            if (guestbooks.isEmpty()) {
	                mencobatutorial guestbook = _mencobatutorialLocalService.addGuestbook(
	                    serviceContext.getUserId(), "Main", serviceContext);

	                guestbookId = guestbook.getGuestbookId();
	            }

	            if (guestbookId == 0) {
	                guestbookId = guestbooks.get(0).getGuestbookId();
	            }

	            renderRequest.setAttribute("guestbookId", guestbookId);
	        }
	        catch (Exception e) {
	            throw new PortletException(e);
	        }

	        super.render(renderRequest, renderResponse);
	}
	
	@Reference(unbind = "-")
    protected void setmencobatutorialEntryService(mencobatutorialEntryLocalService mencobatutorialentryLocalService) {
        _mencobatutorialentryLocalService = mencobatutorialentryLocalService;
    }

    @Reference(unbind = "-")
    protected void setmencobatutorialService(mencobatutorialLocalService mencobatutorialLocalService) {
        _mencobatutorialLocalService = mencobatutorialLocalService;
    }

    private mencobatutorialEntryLocalService _mencobatutorialentryLocalService;
    private mencobatutorialLocalService _mencobatutorialLocalService;
}