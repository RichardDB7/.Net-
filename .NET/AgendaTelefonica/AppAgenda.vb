/*Clase práctica especial Nro.1: Esta clase práctica especial tiene por objeto realizar una aplicación sencilla (muy sencilla)
pero que pueda servirles para cubrir alguna necesidad real que tengan en sus trabajos o en su vida personal. 
La idea es la implementación de un sistema –el que ustedes quieran, ustedes plantearán el enunciado de la aplicación,
indicarán qué es lo que debe hacer y cuáles serán los límites de la misma- trabajando con el lenguaje de programación 
propuesto para la cursada. */


Public Class Form1

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Close()
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click

        Dim guardar As System.IO.StreamWriter
        'Mediante IO.StreamWriter guardo la informacion de los campos en mi archivo txt llamado agenda
        guardar = New IO.StreamWriter("C:\Users\Ricardo\Downloads\Agenda/agenda.txt", True)
        guardar.WriteLine(TextBox1.Text & "; " & TextBox2.Text & "; " & ComboBox1.SelectedItem)
        guardar.Close()





    End Sub
End Class
