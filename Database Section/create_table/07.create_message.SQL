CREATE TABLE message
(
    message_id INT NOT NULL,
    sender_id INT NOT NULL,
    receiver_id INT NOT NULL,
    message_sent VARCHAR2(300) NOT NULL,
    message_date DATE NOT NULL,
    PRIMARY KEY(message_id),
    FOREIGN KEY(sender_id) REFERENCES all_users(user_id),
    FOREIGN KEY(receiver_id) REFERENCES all_users(user_id)
)