SELECT name AS Customers
FROM Customers
LEFT JOIN Orders
ON Orders.customerId = Customers.id
WHERE Orders.customerId IS NULL;