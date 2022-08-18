/*  Iniciando un nuevo repositorio local*/
	git init 
	git pull
	git clone <url>
	git add <file>	
	git commit -m "<msje de commit>"
	git commit -am "<msje de commit sin add>"
	git commit --amend  //enmendar un commit anterior
	
	git remote show origin
	git remote add  origin  https://urlrepo/user/holagit.git 
	
	
	git branch <nombre_branch>
	git branch 	// muestra ramas locales
	git branch -a   // muestra ramas locales y remotos		
	git checkout <branch_existente>	
	git branch 
	git show-branch
	gitk
	 
	 
	 esto es un nuevo cambio para feature2
	 
	git restore --staged    // retira del staging 
	git rm --cached <file>  // retira del staging
	git reset head 			// para mandar  todo a unstage
	
	git log
	git diff
	git stash // guarda en memoria
	git stash list 
	git stash pop
	git stash drop 
	git diff <version1> <version1> <file>
	git branch -D <branch name>  // borra la branch
	
	git reflog // muestra como ha muerto todo 
	//buscar el hash 
	
	git reset head@{123}
	git reset --hard <hash>
	
	git reset <version> --hard  // vuelve en el tiempo de manera agresiva
	git reset <version> -- soft // vuelve pero guarda  lo que esta en stage para el next commit;
	
	
	
	git push origin master // manda a remoto 
	git pull origin master // trae de remoto
	git push --set-upstream origin cabecera // enlazad  remoto y local
	
	git pull origin master --allow-unrelated-histories // permite merge  de repos local y remoto
	
	
	git config -l 
	git config --global user.email "myemail@mydomain.com"



/* creado llaves cripto para SSH */	

	ssh-keygen -t rsa -b 4096 -C "youremail@example.com"  //gerera llave
	eval $(ssh-agent -s)  // revisa si servicio de llaves esta iniciado 
	ssh-add ~/.ssh/id_rsa // agrega al servicio de llaves tu nueva llave 
	
	agregar a git_remoto llave publica generada en seccion:
	/usuario/settings/ssh and gpg/ssh keys 
	
	

	git blame --help
	


referencia: 
	https://platzi.com/tutoriales/1557-git-github/4067-configurar-llaves-ssh-en-git-y-github/


/* sobre la rama donde queremos traer algun comit de otra rama*/
	git cherry-pick <hash-commit>

	
	
git stash : Guarda el trabajo actual de manera temporal. (Archivos modificados o eliminados)
git stash -u : Crea un stash con todos los archivos. (Añadiendo los creados Untracked)
git stash save “mensaje” : Crea un stash con el mensaje especificado.
git stash list : Permite visualizar todos los stash existentes.
git stash clear : Elimina todos los stash existentes.
git stash drop : Elimina el stash más reciente. El que tiene num_stash=0.
git stash drop stash@{num_stash} : Elimina un stash específico.
git stash apply : Aplica el stash más reciente. El que tiene num_stash=0.
git stash apply stash@{num_stash} : Aplica los cambios de un stash específico.
git stash pop : Aplica el stash más reciente y lo elimina. El que tiene num_stash=0.
git stash pop stash@{num_stash} : Aplica los cambios de un stash específico y elimina lo stash.
git stash branch nombre_de_rama : Crea una rama y aplica el stash mas reciente.
git stash branch nombre_de_rama stash@{num_stash} : Crea una rama y aplica el stash especificado.

Consideraciones:

El cambio más reciente (al crear un stash) SIEMPRE recibe el valor 0 y los que estaban antes aumentan su valor.
Al crear un stash tomará los archivos que han sido modificados y eliminados. Para que tome un archivo creado es necesario agregarlo al Staging Area con git add [nombre_archivo] con la intención de que git tenga un seguimiento de ese archivo, o también utilizando el comando git stash -u.
Al aplicar un stash este no se elimina, es buena práctica eliminarlo.
	
	
	
