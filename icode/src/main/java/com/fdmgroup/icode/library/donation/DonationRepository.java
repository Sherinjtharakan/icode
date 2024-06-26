package com.fdmgroup.icode.library.donation;

import java.util.*;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class DonationRepository {
	
	
	private List<Donation> donationList = new ArrayList<>();
	private List<String> targetPrograms = new ArrayList<>();
	
	public DonationRepository(@Qualifier("starterDonationList")List<Donation> starterDonations, @Qualifier("starterDonationPrograms")List<String> targetPrograms) {
		super();
		this.donationList = starterDonations;
		this.targetPrograms = targetPrograms;
	}
	

	
	public Donation save(Donation donation) {
		/*
		 * create an object to capture the data passed in as arguments.
		 * the donation id should be set and generated by using the generateUniqueId method
		 * Save the donation to the library donation catalog
		 * Return the donation that was saved
		 */
		return null;
	}
	

	public List<Donation> getAllDonations() {
		/*
		 * Return the list of all donations that contains the library donation catalog	
		 */
		return null;
	}

    public Donation updateDonationAmountById(Long donationId, Long donationAmount) {
		/*
		 * Search for a donation by id in the library donation catalog and update the donation amount
		 *    -use iteration (for loop) to search for a donation by id
		 * 		 Or
		 * 	  -use stream to search for a donation by id
		 * Return the updated donation or null if the donation is not found
		 *
		 */
		return null;

    }

	public Donation searchDonationById(Long donationId) {
		/*
		 * Search for a donation by id in the library donation catalog
		 *   -use iteration (for loop) to search for a donation by id
		 * 		 Or
		 * 	-use stream to search for a donation by id
		 * Return the donation or null if the donation is not found
		 */
	
		return null;
	}

	public List<String> getTargetPrograms() {
		/*
		 * Return the list of all target programs that contains the library donation catalog
		 * 	
		 */
		return null;
	}

    public Donation updateDonationTargetProgramById(Long donationId, String targetProgram) {
		/*
		 * Search for a donation by id in the library donation catalog and update the target program
		 *   -use iteration (for loop) to search for a donation by id
		 * 		 Or
		 * 	-use stream to search for a donation by id
		 * Return the updated donation or null if the donation is not found
		*/
		return null;
    }

	public Donation searchDonationByDonorName(String donorName) {
		/*
		 * Search for a donation by donor name in the library donation catalog
		 *  -use iteration (for loop) to search for a donation by donor name
		 * 		 Or
		 * 	-use stream to search for a donation by donor name
		 * Return the donation or null if the donation is not found
		 */
		return null;
	}

    public List<String> getStarterDonationPrograms() {
		return this.targetPrograms;
    }
	

	


}
