package com.portfolio.demo.service;

import com.portfolio.demo.model.SocialMedia;

public interface ISocialMediaService {
	
	public void saveSocialMedia(SocialMedia socialMedia);
	public SocialMedia getSocialMedia(Long id);
	public void deleteSocialMedia(Long id);

}
