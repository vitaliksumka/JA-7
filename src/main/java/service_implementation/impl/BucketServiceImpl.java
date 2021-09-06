package service_implementation.impl;

import dao.BucketDAO;

import dao.impl.BucketDaoImpl;
import domain.Bucket;
import service_implementation.BucketService;

import java.sql.SQLException;
import java.util.List;

public class BucketServiceImpl implements BucketService {

    private BucketDAO bucketDAO;
    public BucketServiceImpl() {

        try {
            bucketDAO = new BucketDaoImpl();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Bucket create(Bucket t) {
        return bucketDAO.create(t);
    }

    @Override
    public Bucket read(Integer id) {
        return bucketDAO.read(id);
    }

    @Override
    public Bucket update(Bucket bucket) {
        return bucketDAO.update(bucket);
    }

    @Override
    public void delete(Integer id) {
        bucketDAO.delete(id);
    }

    @Override
    public List<Bucket> readAll() {
        return bucketDAO.readAll();
    }
}
