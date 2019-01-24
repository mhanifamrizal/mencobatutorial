<%@include file="../init.jsp"%>
<liferay-ui:success key="mencobatutorialEntryadded" message="mencobatutorialEntry-added" />
<liferay-ui:success key="mencobatutorialadded" message="mencobatutorial-added" />
<liferay-ui:success key="mencobatutorialEntrydeleted" message="mencobatutorialEntry-deleted" />

<%
long guestbookId = Long.valueOf((Long) renderRequest
        .getAttribute("guestbookId"));
%>

<aui:button-row cssClass="guestbook-buttons">
    <portlet:renderURL var="addEntryURL">
        <portlet:param name="mvcPath" value="/mencobatutorialportlet/edit_entry.jsp" />
        <portlet:param name="guestbookId"
            value="<%=String.valueOf(guestbookId)%>" />
    </portlet:renderURL>
    <aui:button onClick="<%=addEntryURL.toString()%>" value="Add Entry"></aui:button>
</aui:button-row>



<liferay-ui:search-container total="<%=mencobatutorialEntryLocalServiceUtil.getEntriesCount(scopeGroupId,
guestbookId) %>">
<liferay-ui:search-container-results
    results="<%=mencobatutorialEntryLocalServiceUtil.getEntries(scopeGroupId.longValue(),
                    guestbookId, searchContainer.getStart(),
                    searchContainer.getEnd())%>" />

                                      
<liferay-ui:search-container-row
	className="testing.model.mencobatutorialEntry" modelVar="entry">

    <liferay-ui:search-container-column-text property="message" />

    <liferay-ui:search-container-column-text property="name" />

</liferay-ui:search-container-row>

<liferay-ui:search-iterator />

</liferay-ui:search-container>