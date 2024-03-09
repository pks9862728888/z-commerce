-- Create database
CREATE database zcommerce;

-- Create schema
CREATE schema core;

-- Create categories table
CREATE TABLE core.product_category (
    id SERIAL PRIMARY KEY,
    name varchar(1000) NOT NULL,
    created timestamp NOT NULL,
    updated timestamp NOT NULL
);

-- Create product table
CREATE TABLE core.product (
    id SERIAL PRIMARY KEY,
    sku varchar(255) DEFAULT NULL,
    name varchar(255) NOT NULL,
    description varchar(1000) DEFAULT NULL,
    unit_price decimal(13, 2) NOT NULL,
    image_url varchar(255) DEFAULT NULL,
    active boolean DEFAULT true,
    units_in_stock integer DEFAULT NULL,
    category_id BIGINT NOT NULL,
    created timestamp NOT NULL,
    updated timestamp NOT NULL,
    CONSTRAINT fk_category_id
        FOREIGN KEY(category_id)
        REFERENCES core.product_category(id)
        ON DELETE CASCADE
);
