/*Realizar un proyecto que contenga una base de datos con una tabla de tres campos: legajo (entero), nombre (cadena de 30 caracteres) 
y edad (entero). Se desea leer 5 valores de teclado para estos tres campos (5 registros) y escribirlos en la tabla.
Los valores leídos se ingresarán en la tabla solamente si la edad está comprendida entre los 0 y los 80 años,
y el legajo es mayor a 4999. Esto puede hacer que quizás no haya 5 registros cargados en la tabla al finalizar el proceso.*/

ALGORITMO

'Creo una clase estática que contiene la conexión
Public NotInheritable Class Connect

    Public Shared CONN As String = "server=localhost; userid=root; password=; database=tablaparcialdos;"


End Class



Imports MySql.Data.MySqlClient

Public Class Form1

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        'Instancia en conexión de la clase MySqlConnection de la librería MySql.Data.MySqlClient
        Dim conexion As New MySqlConnection
        'Instancia del método MySqlCommand de la librería MySql.Data.MySqlClient
        Dim comando As New MySqlCommand
        'Carga de la leer tabla con la clase MysqlDataReader
        Dim leerTabla As MySqlDataReader

        'Llamada a la clase conexión que contiene el metodo CONN 
        'junto con la propiedad conexion.ConnectionString que
        'contendrá la cadena requerida 
        conexion.ConnectionString = Connect.CONN






        'Metodo de captura de errores
        Try
            'Apertura de conexión
            conexion.Open()

            'Condicional If que determinará si la edad esta entre o y 80, y si el legajo
            'es mayor a 4999
            If TextBox1.Text < 4999 And TextBox3.Text >= 0 And TextBox3.Text <= 80 Then

                MsgBox("Los Datos no son correctos, no fueron insertados")
                limpiar()
                MsgBox("Inserte los datos correctos, El legajo debe partir de 5000 y la edad debe estar comprendida entre 0 y 80")
            Else

                'Creación de variable de cadena que contiena la inserción de datos 
                Dim insertQuery As String = "INSERT INTO empleados VALUES('" & TextBox1.Text & "','" & TextBox2.Text & "','" & TextBox3.Text & "')"


                'Mediante La Clase MySqlCommand realizamos la operación de inserción
                'pasando los respectivos parametos
                comando = New MySqlCommand(insertQuery, conexion)
                'Recuperamos el registro de la tabla empleados
                leerTabla = comando.ExecuteReader()
                MsgBox("Los Datos fueron insertados correctamente")
                limpiar()
            End If


            conexion.Close()

        Catch ex As Exception
            MsgBox("Inserción de datos incorrecta")
            End Try

    End Sub


    'Boton de cierre del formulario
    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Me.Close()
    End Sub

    'Botón de Actualización de información de la tabla
    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Dim conexion As MySqlConnection = New MySqlConnection(Connect.CONN)
        Dim selectQuery As String = "SELECT * FROM empleados"
        Dim comando As MySqlCommand = New MySqlCommand(selectQuery, conexion)
        Dim datoTabla As DataSet = New DataSet()
        Dim Adaptador As MySqlDataAdapter = New MySqlDataAdapter()

        conexion.Open()
        'Consulta a la base de datos
        Adaptador.SelectCommand = comando
        'Agregamos los datos a la tabla
        Adaptador.Fill(datoTabla, "empleados")
        'Traemos los datos de la tabla
        DataGridView1.DataSource = datoTabla
        'Establecemos el nombre de la tabla a mostrar
        DataGridView1.DataMember = "empleados"
        conexion.Close()


    End Sub

    'El método limpìar vacía las textbox luego de la inserción en la tabla
    Private Sub limpiar()
        TextBox1.Text = String.Empty
        TextBox2.Text = String.Empty
        TextBox3.Text = String.Empty
    End Sub


End Class

