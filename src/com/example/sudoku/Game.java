package com.example.sudoku;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Game extends Activity{

	public static final String KEY_DIFFICULTY = "com.example.sudoku.difficulty";
	private static final String TAG = "Sudoku" ;
	public static final int DIFFICULTY_EASY = 0;
	public static final int DIFFICULTY_MEDIUM = 1; 
	public static final int DIFFICULTY_HARD = 2;
	private int puzzle[] = new int[9 * 9];
	private PuzzleView puzzleView;
	
	@Override 
	protected void onCreate(Bundle savedInstanceState) 
	{ 
		super.onCreate(savedInstanceState); 
		Log.d(TAG, "onCreate");
		int diff = getIntent().getIntExtra(KEY_DIFFICULTY, DIFFICULTY_EASY);
		puzzle = getPuzzle(diff);
		calculateUsedTiles();
		puzzleView = new PuzzleView(this);
		setContentView(puzzleView);
		puzzleView.requestFocus();
	} // ...

	private int[] getPuzzle(int diff) {
		// TODO Auto-generated method stub
		return null;
	}

	private void calculateUsedTiles() {
		// TODO Auto-generated method stub
		
	}


}
