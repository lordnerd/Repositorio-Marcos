class CardNews extends HTMLElement{
    constructor(){
        super();

        const shadow = this.attachShadow({mode: "open"});
        shadow.appendChild(this.build());
        shadow.appendChild(this.styles());
    }

    build(){
        const componentRoot = document.createElement("div");
        componentRoot.setAttribute("class", "card");

        const cardLeft = document.createElement("div");
        cardLeft.setAttribute("class", "card-left");

        const autor = document.createElement("span");
        autor.textContent = "By " + (this.getAttribute("autor") || "Anonimous");

        const linkTitle = document.createElement("a");
        linkTitle.textContent = this.getAttribute("title")
        linkTitle.href = this.getAttribute("link-url");

        const newsContent = document.createElement("p");
        newsContent.textContent = this.getAttribute("content");

        cardLeft.appendChild(autor);
        cardLeft.appendChild(linkTitle);
        cardLeft.appendChild(newsContent);

        const cardRight = document.createElement("div");
        cardRight.setAttribute("class", "card-right");
        
        const newsImage = document.createElement("img");
        newsImage.src = this.getAttribute("photo") || "assets/asset-default.png";
        newsImage.alt = "Foto da notícia";
        cardRight.appendChild(newsImage);
        

        componentRoot.appendChild(cardLeft);
        componentRoot.appendChild(cardRight);
        
        return componentRoot;
    }

    styles(){
        const styles = document.createElement("style");
        styles.textContent = `
                .card{
                    width: 80%;
                    box-shadow: 8px 10px 26px 0px rgba(0,0,0,0.75);
                    -webkit-box-shadow: 8px 10px 26px 0px rgba(0,0,0,0.75);
                    -moz-box-shadow: 8px 10px 26px 0px rgba(0,0,0,0.75);;
                    display: flex;
                    flex-direction: row;
                    justify-content: space-between;
                }
                
                .card-left > span{
                    font-weight: 400;
                }
                
                .card-left{
                    display: flex;
                    flex-direction: column;
                    justify-content: center;
                    padding-left: 10px;
                }
                
                .card-left > a{
                    margin-top: 15px;
                    color: black;
                    text-decoration: none;
                    font-weight: bold;
                    font-size: 25px;
                }
                
                .card-left > p{
                    color: rgb(70,70,70);
                }
        `;
        
        return styles
    }
}

customElements.define("card-news", CardNews);