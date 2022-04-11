select distinct marketname from markets.stocktradeacts 
where open_price = open_price and tradingdate between '2022-04-02' and '2022-04-04';
-- тест кейс где условие open_price = open_price true 