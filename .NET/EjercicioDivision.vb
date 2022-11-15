/*Generar un proyecto para poder dividir dos números reales. Considerar que no es posible dividir por*/

Dim a, b, x As Double
        a = Me.TextBox1.Text
        b = Me.TextBox2.Text

        If (b = 0) Then
            MsgBox("No es posible utilizar el 0 intentelo nuevamente", MessageBoxIcon.Warning)

        Else
            x = a / b
            Me.TextBox3.Text = x
        End If
