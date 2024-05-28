INSERT INTO backlog (id, name, description)
VALUES ('uuid-1', 'Backlog 1', 'Description for backlog 1');
INSERT INTO backlog_item (id, status, story, story_points, summary, type, product_id, release_id, sprint_id, backlog_id)
VALUES ('uuid-2', 'Open', 'Story 1', 5, 'Summary for story 1', 'Feature', 'uuid-product', 'uuid-release', 'uuid-sprint',
        'uuid-1');
INSERT INTO task (id, name, description, hours_remaining, volunteer, backlog_item_id)
VALUES ('uuid-3', 'Task 1', 'Description for task 1', 10, 'Volunteer 1', 'uuid-2');
-- for testing purposes you can use the following queries for http://localhost:8081/h2-console/,
-- as for instance:
-- SELECT * FROM backlog;
-- SELECT id, name, description FROM backlog;
-- SELECT * FROM backlog_item;
-- SELECT id, status, summary FROM backlog_item;
-- SELECT * FROM task;
-- SELECT id, name, description FROM task;