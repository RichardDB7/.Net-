/*Generar un proyecto/formulario con un botón y una caja de texto. Cuando se presiona el botón, 
se incrementa la cuenta que muestra la caja de texto. El valor inicial de la misma es el cero. 
De modo que la misma trabajará como un acumulador que se irá 
incrementando de a 1 cada vez que se presione el botón.*/

Public Class Form1
    Dim i As Integer

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        i = i + 1
        TextBox1.Text = i


    End Sub
End Class
