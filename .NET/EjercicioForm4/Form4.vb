/*Generar un proyecto que permita comparar los valores de dos cajas de texto donde se ingresan valores numéricos enteros. 
Indicar si las mismas son iguales, o diferentes. Enviar a pantalla un mensaje que indique “COINCIDEN” o “NO COINCIDEN” 
según corresponda.*/

Public Class Form2
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        'Variables
        Dim a, b As Integer

        a = Me.TextBox1.Text
        b = Me.TextBox2.Text

        If (a = b) Then
            MsgBox("Coinciden")
        Else
            MsgBox("No coinciden")
        End If

    End Sub
End Class
