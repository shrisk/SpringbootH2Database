package com.springboot.h2.serv;

import com.springboot.h2.model.BusRoute;
import com.springboot.h2.repo.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusService {
	@Autowired
    BusRepository repository;

	public void saveBusRoute(final BusRoute busRoute) {
		repository.save(busRoute);
	}

    public List<BusRoute> getBusRoutes() {
        final List<BusRoute> busRoutes = new ArrayList<>();
        repository.findAll().forEach(busRoute -> busRoutes.add(busRoute));
        return busRoutes;
    }

    public BusRoute getBusRouteById(int id) {
        return repository.findById(id).get();
    }

    public BusRoute getBusRouteByRouteId(int id) {
        return repository.findByRouteNo(id);
    }

    public BusRoute getBusRouteByIdAndDriver(int id, String name) {
        return repository.findByRouteNoAndDriverName(id, name);
    }
}
