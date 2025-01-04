CREATE TABLE newsfeed_comment
(
    comment_id INT NOT NULL,
    feed_id INT NOT NULL,
    user_id INT NOT NULL,
    comment_main VARCHAR2(200) NOT NULL,
    comment_date DATE NOT NULL,
    comment_status VARCHAR2(30) DEFAULT NULL,
    PRIMARY KEY(comment_id),
    FOREIGN KEY(feed_id) REFERENCES newsfeed(feed_id) ON DELETE CASCADE,
    FOREIGN KEY(user_id) REFERENCES all_users(user_id) ON DELETE CASCADE
);