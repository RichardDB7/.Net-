/*Generar un proyecto que permita realizar multiplicaciones de dos números 
reales que se ingresan a través de dos cajas de texto, y 
que devuelva el resultado en otra caja. El cálculo se realizará 
cuando se pulsa un botón de comando.*/


Public Class 
    Private Sub IRSOTAREA6_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Close()
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim num1, num2, res As Double

        num1 = Me.TextBox1.Text
        num2 = Me.TextBox2.Text

        res = num1 * num2
        Me.TextBox3.Text = res


    End Sub
End Class
