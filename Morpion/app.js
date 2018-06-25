(function(){
	console.log('Démarrage du Morpion !');
	let Player = function(username,className){
		this.username=username;
		this.className=className;
		this.index=null;
		this.getName = function(){
			return this.username;
		};
	}

	let Game = function(){
		this.turnCount=0;
		this.players=[
			new Player('Joueur 1', "circle"),
			new Player('Joueur 2', "cross"),
		];
		this.data = [
			[],[],[]
		];
		this.playing=false;

		this.checkVictory=function(){
			let won=null;
			
				if(hyperpion.data[0][0]!=null&&hyperpion.data[0][0]==hyperpion.data[0][1]&&hyperpion.data[0][0]==hyperpion.data[0][2]){
					won=window.hyperpion.data[0][0];
				}
				if(hyperpion.data[1][0]!=null&&hyperpion.data[1][0]==hyperpion.data[1][1]&&hyperpion.data[1][0]==hyperpion.data[1][2]){
					won=window.hyperpion.data[1][0];
				}
				if(hyperpion.data[2][0]!=null&&hyperpion.data[2][0]==hyperpion.data[2][1]&&hyperpion.data[2][0]==hyperpion.data[2][2]){
					won=window.hyperpion.data[2][0];
				}
				if(hyperpion.data[0][0]!=null&&hyperpion.data[0][0]==hyperpion.data[1][0]&&hyperpion.data[0][0]==hyperpion.data[2][0]){
					won=window.hyperpion.data[0][0];
				}
				if(hyperpion.data[0][1]!=null&&hyperpion.data[0][1]==hyperpion.data[1][1]&&hyperpion.data[0][1]==hyperpion.data[2][1]){
					won=window.hyperpion.data[0][1];
				}
				if(hyperpion.data[0][2]!=null&&hyperpion.data[0][2]==hyperpion.data[1][2]&&hyperpion.data[0][2]==hyperpion.data[2][2]){
					won=window.hyperpion.data[0][2];
				}
				if(hyperpion.data[0][0]!=null&&hyperpion.data[0][0]==hyperpion.data[1][1]&&hyperpion.data[0][0]==hyperpion.data[2][2]){
					won=window.hyperpion.data[0][0];
				}
				if(hyperpion.data[2][0]!=null&&hyperpion.data[2][0]==hyperpion.data[1][1]&&hyperpion.data[2][0]==hyperpion.data[0][2]){
					won=window.hyperpion.data[1][1];
				}
			
				if(won!=null){
					return (won==hyperpion.players[0].className ? hyperpion.players[0] : hyperpion.players[1]);
				}
				
				return won;
				
		};

		this.stopGame = function(result){
			if(result!=null){
				setTimeout(function(){alert('victoire du '+result.username+'!!')});
			}else{
				setTimeout(function(){alert('Match nul')});
			}

			document.querySelectorAll('table.morpion td').forEach((cell,index,list)=> {
				//console.log(cell,index,list);
				cell.removeEventListener('click',hyperpion.play);
			});
		}

		this.play = function(event){
			//console.log('je suis dans play');
			
			let cell = event.target;
			//console.log(cell);
			let joueur=hyperpion.players[hyperpion.turnCount%2]; 
			//console.log(joueur);
			let token=joueur.className;
			let elmt = document.createElement('div');
			elmt.className=token;
			let ligne = cell.parentElement.className.split('-')[1];
			let colonne = cell.className.split('-')[1];
			hyperpion.data[ligne][colonne]=token;
			//console.log(window.hyperpion.data[ligne][colonne]);
			cell.appendChild(elmt);
			let result = window.hyperpion.checkVictory();	
			if(result==hyperpion.players[0]||result==hyperpion.players[1]||hyperpion.turnCount==8){
				hyperpion.stopGame(result);
				//console.log(event.path[1].classList[0].split('-')[1]);
			}else{
				hyperpion.turnCount++;
				cell.removeEventListener('click',hyperpion.play);
			}

		};

		this.initialize = function(){
			//Recuperer chaque td de la table et associer une fct play() sur l'evenement click
			//let cell = document.getElementsByTagName('td');
			/*for(let i=0;i<cell.length;i++){
				cell[i].addEventListener('click',play);
			}*/

			document.querySelectorAll('table.morpion td').forEach((cell,index,list)=> {
				//console.log(cell,index,list);
				cell.addEventListener('click',this.play);
			});

			console.log(document.getElementById("input1"));
		
		}

		
	}

	window.hyperpion = new Game();
})();
 
