/*SELECT *
FROM markets.stocktradeacts;*/
SELECT AVG(close_price)
FROM markets.stocktradeacts
WHERE corpid>1 and tradingdate between '2022-03-12' and '2022-04-12';
--было б лучше добавить column marketType varchar(3) например oil и делать проверку where marketType = 'oil' но у меня alter table делал столбец ридонли поэтому не смог добавить
