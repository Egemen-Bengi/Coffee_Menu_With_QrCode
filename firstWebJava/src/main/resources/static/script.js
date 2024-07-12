    /* COLD PRODUCTS */
const ulColdElement = document.querySelector('.soguk-urunler-names');
fetch('/productsSogukUrunlerNames')
    .then(response => response.json())
    .then(urunler => {
        urunler.forEach(urun => {
            const liElement = document.createElement('li');
            liElement.textContent = urun;
            ulColdElement.appendChild(liElement);
        });
    })
    .catch(error => console.error('Error:', error));

const ulColdElementPrices = document.querySelector('.soguk-urunler-prices');
fetch('/productsSogukUrunlerPrices')
    .then(response => response.json())
    .then(urunler => {
        urunler.forEach(urun => {
            const liElement = document.createElement('li');
            liElement.textContent = urun;
            ulColdElementPrices.appendChild(liElement);
        });
    })
    .catch(error => console.error('Error:', error));

    /* HOT PRODUCTS */
const ulHotProducts = document.querySelector('.sicak-urunler-names');
fetch('/productsSicakUrunlerNames')
    .then(response => response.json())
    .then(urunler => {
        urunler.forEach(urun => {
            const liElement = document.createElement('li');
            liElement.textContent = urun;
            ulHotProducts.appendChild(liElement);
        });
    })
    .catch(error => console.error('Error:', error));
const ulHotProductsPrices = document.querySelector('.sicak-urunler-prices');
fetch('/productsSicakUrunlerPrices')
    .then(response => response.json())
    .then(urunler => {
        urunler.forEach(urun => {
            const liElement = document.createElement('li');
            liElement.textContent = urun;
            ulHotProductsPrices.appendChild(liElement);
        });
    })
    .catch(error => console.error('Error:', error));


    /* SNACKS */ 
const ulSnacksProducts = document.querySelector('.atistirmalik-names');
fetch('/productsAtistirmaliklarNames')
    .then(response => response.json())
    .then(urunler => {
        urunler.forEach(urun => {
            const liElement = document.createElement('li');
            liElement.textContent = urun;
            ulSnacksProducts.appendChild(liElement);
        });
    })
    .catch(error => console.error('Error:', error));

const ulSnacksProductsPrices = document.querySelector('.atistirmalik-prices');
fetch('/productsAtistirmalikPrices')
    .then(response => response.json())
    .then(urunler => {
        urunler.forEach(urun => {
            const liElement = document.createElement('li');
            liElement.textContent = urun;
            ulSnacksProductsPrices.appendChild(liElement);
        });
    })
    .catch(error => console.error('Error:', error));