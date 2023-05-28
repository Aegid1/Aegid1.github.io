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

    fetch('https://localhost:8080/users', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Error registering user');
        }
        return response.json();
    })
    .then(user => {
        console.log(`User ${user.id} successfully registered!`);
        // Weiterleitung oder Benachrichtigung an den Benutzer hier einfügen
    })
    .catch(error => {

        if (Object.keys(data).length === 0) {
            console.error('Error: Data is empty!');
            return;
        }

        console.log(data);
        console.error(`Error registering user: ${error}`);
        // Fehlerbehandlung hier einfügen
        if (error.message === 'Error registering user') {
            console.log('test');
            alert('The email already exists.');
        }

    });
});
