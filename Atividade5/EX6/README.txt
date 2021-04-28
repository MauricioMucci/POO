Considere que você é dono de uma empresa de software e que sua empresa foi
contratada por uma loja de produtos eletrônicos para escrever um software que
forneça informações a respeito de todos os itens que são vendidos na loja.

Alguns itens podem ser comprados avulsos, como placas, processadores, monitores
de vídeo, teclados, mouse, etc. Enquanto que outros são montados a partir de itens
avulsos e/ou itens montados, como computadores e gabinetes.

Um computador pode ser montado com um monitor de vídeo, um teclado, um
mouse e um gabinete. Já um gabinete é montado com um processador e uma placa.
Todos os itens têm um código sequencial que os identifica unicamente. Qualquer
item, independente de ser um item avulso ou um item montado, deve ser capaz de
informar qual o seu preço. O preço de um item de compra é calculado da seguinte
forma:

• itens avulsos de um mesmo tipo possuem o mesmo preço;
• item montado tem o seu preço calculado pela soma dos preços de suas partes.
Projete as seguintes classes:

a) item: representa um item genérico que possui um código único e possui um método
retornaPreco() que deve ser implementado pelas subclasses desta classe;
b) processador: item avulso cujo preço é de US$150. Possui um tipo que especifica o
modelo do processador;

c) monitor de Vídeo: item avulso cujo preço é de US$350. Possui um tamanho em
polegadas;

d) placa de Memória: item avulso que possui uma capacidade media em GB, cujo
preço é de US$50 por cada 1GB que possui;

e) teclado: item avulso cujo preço é de US$30;

f) mouse: item avulso cujo preço é de US$20;

g) item montado: possui um conjunto de itens que podem ser avulsos ou montados;

h) gabinete: item que o usuário pode montar, com placa de memória e/ou processador;

i) computador: item que o usuário pode montar, como gabinete, monitor, teclado e/ou
mouse.

Implemente o método toString() para todas essas classes.
Pense em uma solução genérica que possa servir para qualquer produto da loja que
possa ser montado a partir de outros já existentes.
Esquematize sua solução (programa) graficamente, mostrando as classes, atributos,
métodos e heranças que fazem parte dela.