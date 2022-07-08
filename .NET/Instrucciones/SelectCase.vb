
/*Generar una instrucción Select-Case para dos ejemplos que se les ocurran*/

Module Module1

    Sub Main(args As String())
        Dim num As Integer //Definimos la variable num como entera
        Console.Write("Ingrese el número 1 o 2: ")
        num = Console.ReadLine()//Mediante la funcion cargamos la variable con1o2
        Select Case num
            Case 1
                Console.Write("Ingresó el numero uno")
            Case 2
                Console.Write("Ingresó el numero dos")
        End Select //fin de la instrucción Select
    End Sub
End Module

