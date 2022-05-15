Public Class Form4
    Private Sub Form4_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Close()

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim m, s, ms, hs, d As Decimal

        m = Me.txtm.Text


        s = m * 60
        ms = s * 100
        hs = m / 60
        d = hs / 24

        Me.txts.Text = s
        Me.txtms.Text = ms
        Me.txths.Text = hs
        Me.txtd.Text = d


    End Sub


End Class
