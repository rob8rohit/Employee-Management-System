axios.get('/api/employees')
    .then(response => {
        const employees = response.data;
        let html = '<ul>';
        employees.forEach(emp => {
            html += `<li>${emp.firstName} ${emp.lastName} - ${emp.email}</li>`;
        });
        html += '</ul>';
        document.getElementById('employeeList').innerHTML = html;
    });
