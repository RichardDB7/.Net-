/*Generar un proyecto/formulario que permita realizar sumas de dos números reales que se ingresan a través de dos cajas de texto, 
y que el mismo devuelva el resultado en otra caja. El cálculo se realizará cuando se pulsa el botón =.


    AAAAA
	    +	
		AAAAA
=	-----------
		RRRRR */
    
    Public Class Form1

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim a, b, suma As Double
        a = TextBox1.Text
        b = TextBox2.Text
        suma = a + b
        TextBox3.Text = suma
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        TextBox1.Text = ""
        TextBox2.Text = ""
        TextBox3.Text = ""
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click


        End

    End Sub
End Class
