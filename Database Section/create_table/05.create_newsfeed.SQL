CREATE TABLE newsfeed
(
    feed_id INT NOT NULL,
    user_id INT NOT NULL,
    feed_creator VARCHAR2(30) NOT NULL,
    feed_subject VARCHAR2(30) DEFAULT 'POST',
    feed_post VARCHAR2(700) NOT NULL,
    feed_creation_date DATE NOT NULL,
    comments INT DEFAULT 0,
    PRIMARY KEY(feed_id),
    FOREIGN KEY(user_id) REFERENCES all_users(user_id)ON DELETE CASCADE
);