SELECT corpid, marketname, tradingdate, open_price, hi_price, lo_price, close_price, trading_volume
FROM markets.stocktradeacts
WHERE marketname = 'Intel' and tradingdate between '2022-04-01' and '2022-04-08';
