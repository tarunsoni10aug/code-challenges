package com.phonechessproblem.pieces;

import com.phonechessproblem.constant.PhoneChessConstant;
import com.phonechessproblem.utils.PhoneChessUtils;

public class Queen extends  ChessPiece{
	
	public void CalculateNumberOfPossibleCombinations(int startNumber)
	{
		PhoneChessUtils.CalculateNumberOfPossibleCombinations(startNumber, PhoneChessConstant.QUEEN_MOVES);
	}

}
