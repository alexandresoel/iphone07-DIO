# Desafio Diagrama da DIO
## Diagrama da Classe
```mermaid
classDiagram
    Iphone <|-- Reprodutor_Musical
    Iphone <|-- Aparelho_Telefônico
    Iphone <|-- Navegador
    Iphone <|-- Camera
    class Reprodutor_Musical{
      -tocar() 
      -pausar()
      -selecionarMusica(String musica)
    }
    class Aparelho_Telefônico{
      -ligar(String Numero)
      -atender()
      -iniciarCorreioVoz()
    }
    class Navegador{
      -exibirPagina(String url)
      -adicionarNovaAba()
      -atualizarPagina()
    }
    class Camera{
      -fotografar()
      -filmar()
    }
    ```
