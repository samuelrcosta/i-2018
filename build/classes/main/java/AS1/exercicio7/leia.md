#### O índice é composto da seguinte forma:
Os 4 primeiros bytes correspondem a quantidade de linhas existentes no aqruivo.  
Os próximos conjuntos de 4 bytes correspondem ao tamanho de cada linha.  
Se um arquivo possui 3 linhas, seu indice será composto pelos 4 primeiros bytes que corresponderá ao número 3, e os 12 próximos bytes correspondem ao tamanho de cada uma das três linhas.  
Os outros bytes existentes correspondem as linhas em formato binário propriamente dito.