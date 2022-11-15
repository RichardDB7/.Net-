/*Realizar utilizando Visual Basic un proyecto de un formulario que permita calcular X^3+2*X-3 donde X es un número ingresado 
a una caja de texto. Devolver el resultado en otra caja de texto como variant. Considerar que el número ingresado 
debe estar comprendido entre los valores 4 y 71.*/

Public Class Form1
    'Defino el boton que dispara el evento del cálculo
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        'Variables 
        Dim x1, x2, r As VariantType

        x1 = Me.TextBox1.Text
        x2 = Me.TextBox2.Text

        'Condicional
        If (x1 > 4 Or x1 > 71) Or (x2 > 4 Or x2 > 71) Then
            r = (x1 ^ 3) + (2 * x2) - 3
            Me.TextBox3.Text = r
        Else
            MsgBox("Los numeros deben estar comprendidos entre 4 y 71")
        End If


    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub
End Class
