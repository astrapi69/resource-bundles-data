alter table bundle_application_bundlenames drop constraint FKE03DE2DA81FDD8D7;
alter table bundle_application_bundlenames drop constraint FKE03DE2DA64F45D92;
alter table bundle_application_language_locales drop constraint FKC6BB891EFB766A66;
alter table bundle_application_language_locales drop constraint FKC6BB891E64F45D92;
alter table bundle_applications drop constraint FK176B41C017DEE600;
alter table bundlenames drop constraint FKF230A806D4CC327E;
alter table bundlenames drop constraint FKF230A80663C76715;
alter table default_locale_basenames drop constraint FKC87181B017DEE600;
alter table default_locale_basenames drop constraint FKC87181B0BE71D570;
alter table resourcebundles drop constraint FKD0A7106365054731;
alter table resourcebundles drop constraint FKD0A71063BE71D570;
drop table basenames;
drop table bundle_application_bundlenames;
drop table bundle_application_language_locales;
drop table bundle_applications;
drop table bundlenames;
drop table default_locale_basenames;
drop table language_locales;
drop table languages;
drop table properties_keys;
drop table resourcebundles;
drop sequence hibernate_sequence;
