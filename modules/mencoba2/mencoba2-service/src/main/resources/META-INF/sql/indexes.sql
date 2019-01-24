create index IX_CB2E8147 on S_mencoba2 (groupId);
create unique index IX_214CEE39 on S_mencoba2 (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A59A46FD on S_mencoba2Entry (groupId, guestbookId);
create index IX_38FD33EF on S_mencoba2Entry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E6CFEA31 on S_mencoba2Entry (uuid_[$COLUMN_LENGTH:75$], groupId);