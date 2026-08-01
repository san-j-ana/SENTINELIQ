CREATE TABLE transactions (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    transaction_id VARCHAR(100),
    customer_name VARCHAR(100),
    amount DOUBLE,
    merchant VARCHAR(100),
    location VARCHAR(100),
    payment_method VARCHAR(50),
    risk_score INT,
    status VARCHAR(20)
);
