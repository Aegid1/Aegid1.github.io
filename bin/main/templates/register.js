const form = document.querySelector('form');
const submitButton = document.querySelector('button[type="submit"]');

submitButton.addEventListener('click', (event) => {
    event.preventDefault();

    const data = {
        firstname: form.firstname.value,
        lastname: form.lastname.value,
        password: form.password.value,
        country: form.country.value,
        city: form.city.value,
        postalcode: form.postalcode.value,
        address: form.address.value,
        email: form.email.value,
    };
    
    fetch('users/user', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
    .then(response => response.json())
    .then(user => {
        console.log(`User ${user.id} successfully registered!`);
        // Weiterleitung oder Benachrichtigung an den Benutzer hier einfügen
    })
    .catch(error => {
        console.error(`Error registering user: ${error}`);
        // Fehlerbehandlung hier einfügen
    });
});