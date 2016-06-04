alter table bundlenames add constraint FKF230A806D4CC327E foreign key (locale_id) references language_locales;
alter table bundlenames add constraint FKF230A80663C76715 foreign key (base_name_id) references basenames;
alter table default_locale_basename_map add constraint FKD0DB6E4017DEE600 foreign key (default_locale_id) references language_locales;
alter table default_locale_basename_map add constraint FKD0DB6E40BE71D570 foreign key (bundlename_id) references bundlenames;
alter table resourcebundles add constraint FKD0A7106365054731 foreign key (properties_key_id) references properties_keys;
alter table resourcebundles add constraint FKD0A71063BE71D570 foreign key (bundlename_id) references bundlenames;
create sequence hibernate_sequence;
