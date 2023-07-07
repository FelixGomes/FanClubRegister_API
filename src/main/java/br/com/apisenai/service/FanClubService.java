package br.com.apisenai.service;

import br.com.apisenai.Repository.FanClubRepository;
import br.com.apisenai.domain.entity.FanClub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FanClubService {

    @Autowired
    FanClubRepository fanClubRepository;

    public FanClub createFanClub(FanClub fanClub) {
        return fanClubRepository.save(fanClub);
    }

    public List<FanClub> findAll() {
        return fanClubRepository.findAll();
    }

    public Optional<FanClub> findFanClubById(Long id) {
        return fanClubRepository.findById(id);
    }

    public List<FanClub> findFanClubByName(String fanClubName) {
        return fanClubRepository.findFanClubByName(fanClubName);
    }

    public void deleteFanClub(Long id) {
        fanClubRepository.deleteById(id);
    }

    public void updateName(String name, Long id) {
        fanClubRepository.updateFanClubName(name, id);
    }

    public void updateDescription(String description, Long id) {
        fanClubRepository.updateFanClubDescription(description, id);
    }

}
