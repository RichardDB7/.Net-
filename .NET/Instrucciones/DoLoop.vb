/* Generar una instrucción Do-Loop para dos ejemplos que se les ocurran */


Module Module1

    Sub Main()

        Dim cont As Integer = 0 // Definimos la variable como entera
        Do //La iteracion comienza en cero e incrementa en 1 por vuelta
            Console.WriteLine("Cont {0}", cont) cont += 1

        Loop While cont < 10 // La condicion de corte del bucle es llegar a 9
        Console.ReadLine()




    End Sub

End Module

