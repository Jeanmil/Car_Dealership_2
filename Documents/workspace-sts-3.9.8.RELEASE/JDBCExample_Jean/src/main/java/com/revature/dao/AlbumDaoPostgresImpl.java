package com.revature.dao;

import java.sql.Connection;
import java.util.*;
import com.revature.pojo.Album;

import com.revature.util.ConnectionFactory;

public class AlbumDaoPostgresImpl implements AlbumDao{
	
	private static Connection conn = ConnectionFactory.getConnection();

	@Override
	public void saveAlbum(Album a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAlbum(int albu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAlbum(Album a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Album> getAllAlbums() {
		 
		return null;
	}

	@Override
	public Album getAlbumById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}