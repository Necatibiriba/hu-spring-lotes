// Call the dataTables jQuery plugin
$(document).ready(function() {
  chargeUser();
  $('#usersTable').DataTable();
});

async function chargeUser() {
    const request = await fetch('usuarios', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        }
      });
      const users = await request.json();

      console.log(users);

}
