create index IX_472A26D1 on S_mencobatutorial (groupId);
create unique index IX_663FD96F on S_mencobatutorial (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E7AF5E07 on S_mencobatutorialEntry (groupId, guestbookId);
create index IX_7D7B5FF9 on S_mencobatutorialEntry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_481D90BB on S_mencobatutorialEntry (uuid_[$COLUMN_LENGTH:75$], groupId);