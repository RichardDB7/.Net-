Public Class Form2
    Private Sub Form2_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Close()

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim base, altura, area As Double

        base = Me.txtbase.Text
        altura = Me.txtaltura.Text
        area = (base * altura) / 2
        Me.txtarea.Text = area
    End Sub


End Class