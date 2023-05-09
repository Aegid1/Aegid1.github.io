const form = document.querySelector('form');
const submitButton = document.querySelector('button[type="submit"]');

submitButton.addEventListener('click', (event) => {
    event.preventDefault();

    const data = {
        firstname: form.firstname.value,
        lastname: form.lastname.value,
        email: form.email.value,
        password: form.password.value
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