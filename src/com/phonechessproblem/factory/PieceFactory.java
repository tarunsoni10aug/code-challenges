package com.phonechessproblem.factory;

import java.util.HashMap;
import java.util.Map;

import com.phonechessproblem.pieces.Bishop;
import com.phonechessproblem.pieces.ChessPiece;
import com.phonechessproblem.pieces.King;
import com.phonechessproblem.pieces.Knight;
import com.phonechessproblem.pieces.Pawn;
import com.phonechessproblem.pieces.Queen;
import com.phonechessproblem.pieces.Rook;

public class PieceFactory {
	public static ChessPiece getPiece(String piece) {
		Map<String, ChessPiece>map = new HashMap<String, ChessPiece>();
		map.put("knight", new Knight());
		map.put("king", new King());
		map.put("queen", new Queen());
		map.put("pawn", new Pawn());
		map.put("rook", new Rook());
		map.put("bishop", new Bishop());
		return map.get(piece.toLowerCase());
	}

}
