<div id="header">
    <h2>FreeMarker Spring MVC Hello World</h2>
</div>
<div id="content">

    <br/>
    <table class="datatable">
        <tr>
            <th>Make</th>
            <th>Model</th>
        </tr>
    <#list model["personList"] as person>
      <tr>
          <td>${person.id}</td>
          <td>${person.lastName}</td>
          <td>${person.firstName}</td>
          <td>${person.middleName}</td>
          <td>${person.dateBirth?date}</td>
          <td>${person.phoneNumber}</td>
      </tr>
    </#list>
    </table>
</div>