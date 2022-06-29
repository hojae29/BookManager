/* test시 실행되는 쿼리*/

call next value for hibernate_sequence;
insert into user(`id`, `name`, `email`, `created_at`, `updated_at`)
values(1, 'hojae', 'hojae@naver.com', now(), now());

call next value for hibernate_sequence;
insert into user(`id`, `name`, `email`, `created_at`, `updated_at`)
values(2, 'dennis', 'dennis@naver.com', now(), now());

call next value for hibernate_sequence;
insert into user(`id`, `name`, `email`, `created_at`, `updated_at`)
values(3, 'sophia', 'sophia@naver.com', now(), now());

call next value for hibernate_sequence;
insert into user(`id`, `name`, `email`, `created_at`, `updated_at`)
values(4, 'james', 'james@naver.com', now(), now());

call next value for hibernate_sequence;
insert into user(`id`, `name`, `email`, `created_at`, `updated_at`)
values(5, 'hojae', 'hojae@another.com', now(), now())