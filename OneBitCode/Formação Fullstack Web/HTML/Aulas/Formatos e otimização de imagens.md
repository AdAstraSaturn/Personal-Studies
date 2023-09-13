# Formatos e Otimização de imagens

-   É **extremamente importante** que uma página web esteja **sempre** bem otimizada, e um dos aspectos que pode atrapalhar a questão de desempenho da página, são **arquivos de mídia**, nesse caso, imagens.
-   **Páginas pesadas demoram para carregar**, gerando uma experiência ruim para o usuário. Além disso, **páginas pesadas consomem mais dados**, o que é ruim para quem tem acesso limitado a dados como planos de internet por exemplo.

## Como otimizar imagens?

-   **Utilizando os formatos corretos**:
    -   **PNG**: Formato de mais qualidade, porém mais pesado. Além disso, arquivos PNG possuem o canal alpha, que permite o acesso a transparência da imagem.
    -   **JPEG**: Formato de qualidade inferior ao PNG, mas que pode ser comprimido mantendo a qualidade.
    -   **WEBP**: Formato criado especificamente para a web pelo **Google**, oferece o melhor equilíbrio entre qualidade e tamanho.
    -   **SVG**: Formato usado para vetores, que são imagens geométricas super leves e que podem escalar para qualquer tamanho sem perder qualidade, por exemplo: ícones.
-   **Utilize os tamanhos corretos**
    -   Imagens grandes demais ficam pesadas e pequenas demais ficam pixeladas.
    -   Se necessário, use o atributo "srcset" para definir diferentes versões da imagem para diferentes dispositivos, por exemplo, dispositivos móveis não precisam de imagens de grande qualidade por se tratarem de dispositivos com telas pequenas.
-   **Comprima a imagem, se possível**
    -   Isso pode ser feito através de algoritmos, ou de forma manual se necessário.
