/*  Iniciando un nuevo repositorio local*/
	git init 
	git pull
	git clone <url>
	git add <file>	
	git commit -m "<msje de commit>"
	git commit -am "<msje de commit sin add>"
	
	
	git branch <nombre_branch>
	git branch 
	git branch -a 
	
	
	git checkout <branch_existente>
	git branch 
	 
	git restore --staged    // retira del staging 
	git rm --cached <file>  // retira del staging
	git reset head 			// para mandar  todo a unstage
	
	git log
	git diff
	git diff <version1> <version1> <file>
	
	
	git reset <version> --hard  // vuelve en el tiempo de manera agresiva
	git reset <version> -- soft // vuelve pero guarda  lo que esta en stage para el next commit;
	
	git remote show origin
	git remote add origin  https://urlrepo/user/holagit.git 
	
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
	
	


	


referencia: 
	https://platzi.com/tutoriales/1557-git-github/4067-configurar-llaves-ssh-en-git-y-github/


	


	
	
	
	
	