-- product_category
insert into core.product_category(name, created, updated) values ('Electronics', NOW(), NOW());
insert into core.product_category(name, created, updated) values ('Wearables', NOW(), NOW());

-- product
insert into core.product (sku, name, unit_price, units_in_stock, category_id, created, updated) values ('UUID-1', 'Realme 6', 15000.25, 4, 2, NOW(), NOW());
insert into core.product (sku, name, unit_price, units_in_stock, category_id, created, updated) values ('UUID-1', 'Realme 7', 16000.00, 2, 2, NOW(), NOW());
insert into core.product (sku, name, unit_price, units_in_stock, category_id, created, updated) values ('UUID-1', 'Realme XT', 17000.00, 5, 2, NOW(), NOW());
insert into core.product (sku, name, unit_price, units_in_stock, category_id, created, updated) values ('UUID-1', 'Zabong Tshirt XL', 1500.00, 4, 3, NOW(), NOW());
