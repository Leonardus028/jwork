package leonarduskevin.jwork;
/**
 * Merupakan Enum Class yang berfungsi untuk membatasi kategori 
 * pekerjaan yang ada
 * @Leonardus Kevin
 * @25.03.2021
 */
public enum JobCategory
{
    WebDeveloper, FrontEnd, BackEnd, UI, UX, Devops, DataScientist, DataAnalyst;
    public String toString() {
        switch(this) {
            case WebDeveloper:
                return "Web Developer";
            case FrontEnd:
                return "Front End";
            case BackEnd:
                return "Back End";
            case UI:
                return "UI";
            case UX:
                return "UX";
            case Devops:
                return "Devops";
            case DataScientist:
                return "Data Scientist";
            case DataAnalyst:
                return "Data Analyst";
            default:
                return null;
            }
    }
}


