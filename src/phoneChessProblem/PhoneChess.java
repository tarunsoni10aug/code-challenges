package phoneChessProblem;

import java.util.Scanner;

import com.phonechessproblem.factory.PieceFactory;
import com.phonechessproblem.pieces.ChessPiece;
import com.phonechessproblem.utils.PhoneChessUtils;


public class PhoneChess {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
        System.out.println("please Enter start number between 0-9");
		String startNumber = sc.nextLine();
		System.out.println("please Enter chess Piece [queen, knight, king,rook, bishop,pawn]");
		String pieceName=sc.nextLine();
		PhoneChessUtils.checkValidChessPiece(pieceName);
		PhoneChessUtils.checkValidStartNumber(startNumber);
		ChessPiece piece = PieceFactory.getPiece(pieceName);
		int parseInt = Integer.parseInt(startNumber.trim());
		piece.CalculateNumberOfPossibleCombinations(parseInt);
		}

}
